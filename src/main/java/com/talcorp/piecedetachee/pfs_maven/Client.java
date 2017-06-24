package com.talcorp.piecedetachee.pfs_maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.util.FileManager;

public class Client {

	public String firstName, lastName, birthDate, age, adress, CCNumber,
			CCType, identityCardNumber, driverLicenseNumber, passPortNumber,
			service, driverLicenseED, driverLicenseDD, identityCardED,
			identityCardDD, passPortED, passPortDD;

	public Client(String fn, String ln, String bd, String age, String adr,
			String CCN, String CCT, String idCN, String dl, String pp,
			String dlED, String dlDD, String ppED, String ppDD, String idED,
			String idDD, String serv) {
		firstName = fn;
		lastName = ln;
		birthDate = bd;
		this.age = age;
		adress = adr;
		CCNumber = CCN;
		CCType = CCT;
		identityCardNumber = idCN;
		driverLicenseNumber = dl;
		passPortNumber = pp;
		driverLicenseDD = dlDD;
		driverLicenseED = dlED;
		passPortDD = ppDD;
		passPortED = ppED;
		identityCardDD = idDD;
		identityCardED = idED;
		service = serv;

	}

	// housseyn begin
	public Client(String location) {
		// TODO Auto-generated constructor stub
		readOnthologie(location);
	}

	// housseyn end

	public void createClientIndividual() {
		// insertion du nom et prénom du client
		if ((!firstName.equals("")) && !lastName.equals("")) {

			Individual ind = ontModel
					.createIndividual(
							"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
									+ lastName + firstName,
							ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#Client"));
			createFristAndLastNames(ind); // hadi nti konti reditiha commentaire
											// ???

			if (age != null) {
				createBDAndAgeAndAdress(ind);

			}// end of age
			if (CCNumber != null && CCType != "No Card") {
				createCreditCard(ind);

			}
			// inserting ID card number
			if (identityCardNumber != null) {
				createIdentityCard(ind);
				// inserting driver licence number
				if ((!driverLicenseNumber.equals(null))
						&& Integer.parseInt(age) > 17) {
					createDriverLicense(ind);

				}
				// inserting passport number
				if (!passPortNumber.equals(null)) {
					createPassPort(ind);

				}
			}// end of identity
				// retention & purpose &

			if (service != null) {
				Property ps = ontModel
						.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasService");
				RDFNode ns = ontModel
						.getIndividual("http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ service);

				ind.setPropertyValue(ps, ns);
			}

		}// end of first name & lastname

	}

	public void insertClient(String ontFile) {
		try {
			readOnthologie(ontFile);
			createClientIndividual();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			JOptionPane
					.showMessageDialog(null,
							"svp vérifier si les informations que vous avez saisi sont correct !☺");
		}
		ontModel.write(System.out);//, "RDF/XML-ABBREV");
		File f = new File(ontFile);
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(f);
			ontModel.write(fo);//, "RDF/XML-ABBREV");
			ontModel.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static OntModel ontModel;

	// on a declarer cette methode static car elle est independant de toutes les
	// instances créer par cette class
	public static void readOnthologie(String ontFile) {

		// the next line for reading the ontholgy
		FileManager.get().addLocatorClassLoader(Client.class.getClassLoader());
		ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		ontModel.read(ontFile);
	}

	public void createBDAndAgeAndAdress(Individual client) {
		// creating the BD & Age & Adress individual
		Individual bd = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "BdDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#BdDate"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode bdv = ontModel.createLiteral(birthDate);
		bd.setPropertyValue(valuePrp, bdv);
		setPolicy(bd, Menu4.bdRetention.getSelectedItem().toString(),
				Menu4.bdRecipient.getSelectedItem().toString(), Menu4.bdPurpose
						.getSelectedItem().toString());
		// age
		Individual ag = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "Age",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#Age"));
		RDFNode agv = ontModel.createLiteral(age);
		ag.setPropertyValue(valuePrp, agv);
		setPolicy(ag, Menu4.ageRetention.getSelectedItem().toString(),
				Menu4.ageRecipient.getSelectedItem().toString(),
				Menu4.agePurpose.getSelectedItem().toString());
		// adress
		Individual adr = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "Adress",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#Adress"));
		RDFNode adrv = ontModel.createLiteral(adress);
		adr.setPropertyValue(valuePrp, adrv);
		setPolicy(adr, Menu4.adrRetention.getSelectedItem().toString(),
				Menu4.adrRecipient.getSelectedItem().toString(),
				Menu4.adrPurpose.getSelectedItem().toString());

		// hasFisrtName property domain : client , range : FrsitName
		Property hasBD = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasBdDate");
		Property hasAg = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasAge");
		Property hasAdr = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasAdress");
		// attribut the fn & ln to the client
		client.setPropertyValue(hasBD, bd);
		client.setPropertyValue(hasAg, ag);
		client.setPropertyValue(hasAdr, adr);
	}

	public void createFristAndLastNames(Individual client) {
		// creating the first & last names individual
		Individual fn = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "FirstName",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#FirstName"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode fnv = ontModel.createLiteral(firstName);
		fn.setPropertyValue(valuePrp, fnv);
		setPolicy(fn, Menu4.fnRetention.getSelectedItem().toString(),
				Menu4.fnRecipient.getSelectedItem().toString(), Menu4.fnPurpose
						.getSelectedItem().toString());
		// last name
		Individual ln = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "LastName",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#LastName"));
		RDFNode lnv = ontModel.createLiteral(lastName);
		Property valuePrp2 = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		ln.setPropertyValue(valuePrp2, lnv);
		setPolicy(ln, Menu4.lnRetention.getSelectedItem().toString(),
				Menu4.lnRecipient.getSelectedItem().toString(), Menu4.lnPurpose
						.getSelectedItem().toString());
		// hasFisrtName property domain : client , range : FrsitName
		Property hasFN = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasFirstName");
		Property hasLN = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasLastName");
		// attribut the fn & ln to the client
		client.setPropertyValue(hasFN, fn);
		client.setPropertyValue(hasLN, ln);
	}

	public void createCreditCard(Individual client) {
		// creating the credit card individual
		Individual cc = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "CreditCard",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#CreditCard"));

		// creating the data for CreditCard individuals
		// the number
		Individual num = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "CreditCardNumber",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#CreditCardNumber"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode vn = ontModel.createLiteral(CCNumber);
		num.setPropertyValue(valuePrp, vn);
		setPolicy(num, Menu4.ccRetention.getSelectedItem().toString(),
				Menu4.ccRecipient.getSelectedItem().toString(), Menu4.ccPurpose
						.getSelectedItem().toString());
		// type
		Individual cct = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "CCType",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#CCType"));
		RDFNode ved = ontModel.createLiteral(CCType);
		cct.setPropertyValue(valuePrp, ved);
		setPolicy(cct, Menu4.ccRetention.getSelectedItem().toString(),
				Menu4.ccRecipient.getSelectedItem().toString(), Menu4.ccPurpose
						.getSelectedItem().toString());
		// setting the data to the CC created
		Property hasNumber = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasNumber");
		cc.setPropertyValue(hasNumber, num);
		Property hasType = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasCCType");
		cc.setPropertyValue(hasType, cct);
		// hasPassport property domain : client , range : creditcard
		Property hasdl = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasCreditCard");
		// attribut the cc to the client
		client.setPropertyValue(hasdl, cc);
	}

	public void createPassPort(Individual client) {
		// creating the passport individual
		Individual dcl = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "PassPort",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#PassPort"));

		// creating the data for passport individuals
		// the number
		Individual num = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "PassPortNumber",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#PassPortNumber"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode vn = ontModel.createLiteral(passPortNumber);
		num.setPropertyValue(valuePrp, vn);
		setPolicy(num, Menu4.ppRetention.getSelectedItem().toString(),
				Menu4.ppRecipient.getSelectedItem().toString(), Menu4.ppPurpose
						.getSelectedItem().toString());
		// expiration date
		Individual eDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName
								+ "PassPortExpirationDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#PassPortExpirationDate"));
		RDFNode ved = ontModel.createLiteral(passPortED);
		eDate.setPropertyValue(valuePrp, ved);
		setPolicy(eDate, Menu4.ppRetention.getSelectedItem().toString(),
				Menu4.ppRecipient.getSelectedItem().toString(), Menu4.ppPurpose
						.getSelectedItem().toString());
		// deliverydate
		Individual dDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "PassPortDeliveryDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#PassPortDeliveryDate"));
		RDFNode vdd = ontModel.createLiteral(passPortDD);
		dDate.setPropertyValue(valuePrp, vdd);
		setPolicy(dDate, Menu4.ppRetention.getSelectedItem().toString(),
				Menu4.ppRecipient.getSelectedItem().toString(), Menu4.ppPurpose
						.getSelectedItem().toString());
		// setting the data to the passport created
		Property hasNumber = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasNumber");
		dcl.setPropertyValue(hasNumber, num);
		Property hasED = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasExpirationDate");
		dcl.setPropertyValue(hasED, eDate);
		Property hasDD = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasDeliveryDate");
		dcl.setPropertyValue(hasDD, dDate);
		// hasPassport property domain : client , range : passport
		Property hasdl = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasPassPort");
		// attribut the passport to the client
		client.setPropertyValue(hasdl, dcl);
	}

	public void createDriverLicense(Individual client) {
		// creating the driverLcense individual
		Individual dcl = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "DriverLicense",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#DriverLicense"));

		// creating the data for driver license individuals
		// the number
		Individual num = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "DriverLicenseNumber",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#DriverLicenseNumber"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode vn = ontModel.createLiteral(driverLicenseNumber);
		num.setPropertyValue(valuePrp, vn);
		setPolicy(num, Menu4.dlRetention.getSelectedItem().toString(),
				Menu4.dlRecipient.getSelectedItem().toString(), Menu4.dlPurpose
						.getSelectedItem().toString());
		// expiration date
		Individual eDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName
								+ "DriverLicenseExpirationDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#DriverLicenseExpirationDate"));
		RDFNode ved = ontModel.createLiteral(driverLicenseED);
		eDate.setPropertyValue(valuePrp, ved);
		setPolicy(eDate, Menu4.dlRetention.getSelectedItem().toString(),
				Menu4.dlRecipient.getSelectedItem().toString(), Menu4.dlPurpose
						.getSelectedItem().toString());
		// deliverydate
		Individual dDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName
								+ "DriverLicenseDeliveryDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#DriverLicenseDeliveryDate"));
		RDFNode vdd = ontModel.createLiteral(driverLicenseDD);
		dDate.setPropertyValue(valuePrp, vdd);
		setPolicy(dDate, Menu4.dlRetention.getSelectedItem().toString(),
				Menu4.dlRecipient.getSelectedItem().toString(), Menu4.dlPurpose
						.getSelectedItem().toString());
		// setting the data to the driverlicense created
		Property hasNumber = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasNumber");
		dcl.setPropertyValue(hasNumber, num);
		Property hasED = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasExpirationDate");
		dcl.setPropertyValue(hasED, eDate);
		Property hasDD = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasDeliveryDate");
		dcl.setPropertyValue(hasDD, dDate);
		// hasDriverLicense property domain : client , range : driverLicense
		Property hasdl = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasDriverLicense");
		// attribut the driver license to the client
		client.setPropertyValue(hasdl, dcl);
	}

	public void createIdentityCard(Individual client) {
		// creating the IdentityCard individual
		Individual dcl = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "IdentityCard",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#IdentityCard"));

		// creating the data for IdentityCardindividuals
		// the number
		Individual num = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName + "IdentityCardNumber",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#IdentityCardNumber"));
		Property valuePrp = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasValue");
		RDFNode vn = ontModel.createLiteral(identityCardNumber);
		num.setPropertyValue(valuePrp, vn);
		setPolicy(num, Menu4.idRetention.getSelectedItem().toString(),
				Menu4.idRecipient.getSelectedItem().toString(), Menu4.idPurpose
						.getSelectedItem().toString());
		// expiration date
		Individual eDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName
								+ "IdentityCardExpirationDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#IdentityCardExpirationDate"));
		RDFNode ved = ontModel.createLiteral(identityCardED);
		eDate.setPropertyValue(valuePrp, ved);
		setPolicy(eDate, Menu4.idRetention.getSelectedItem().toString(),
				Menu4.idRecipient.getSelectedItem().toString(), Menu4.idPurpose
						.getSelectedItem().toString());
		// deliverydate
		Individual dDate = ontModel
				.createIndividual(
						"http://www.semanticweb.org/home/ontologies/2016/10/ex#"
								+ lastName + firstName
								+ "IdentityCardDeliveryDate",
						ontModel.getOntClass("http://www.semanticweb.org/home/ontologies/2016/10/ex#IdentityCardDeliveryDate"));
		RDFNode vdd = ontModel.createLiteral(identityCardDD);
		dDate.setPropertyValue(valuePrp, vdd);
		setPolicy(dDate, Menu4.idRetention.getSelectedItem().toString(),
				Menu4.idRecipient.getSelectedItem().toString(), Menu4.idPurpose
						.getSelectedItem().toString());
		// setting the data to the IdentityCard created
		Property hasNumber = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasNumber");
		dcl.setPropertyValue(hasNumber, num);
		Property hasED = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasExpirationDate");
		dcl.setPropertyValue(hasED, eDate);
		Property hasDD = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasDeliveryDate");
		dcl.setPropertyValue(hasDD, dDate);
		// hasIdentityCard property domain : client , range : IdentityCard
		Property hasdl = ontModel
				.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasIdentityCard");
		// attribut the IdentityCard to the client
		client.setPropertyValue(hasdl, dcl);
	}

	public void setPolicy(Individual dataType, String retention,
			String recipient, String purpose) {
		// retention & purpose &
		if (retention != null) {
			Property pr = ontModel
					.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasRetention");
			RDFNode nr = ontModel
					.getIndividual("http://www.semanticweb.org/home/ontologies/2016/10/ex#"
							+ retention);

			dataType.setPropertyValue(pr, nr);
		}
		if (recipient != null) {
			Property prc = ontModel
					.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasRecipient");
			RDFNode nrc = ontModel
					.getIndividual("http://www.semanticweb.org/home/ontologies/2016/10/ex#"
							+ recipient);

			dataType.setPropertyValue(prc, nrc);
		}
		if (purpose != null) {
			Property ppr = ontModel
					.getProperty("http://www.semanticweb.org/home/ontologies/2016/10/ex#hasPurpose");
			RDFNode npr = ontModel
					.getIndividual("http://www.semanticweb.org/home/ontologies/2016/10/ex#"
							+ purpose);

			dataType.setPropertyValue(ppr, npr);
		}
	}

	public void selectByFullName(String firstName,String lastName) {
		// TODO Auto-generated method stub

		String query = "PREFIX  ex:   <http://www.semanticweb.org/home/ontologies/2016/10/ex#>"
				+"PREFIX ns: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "SELECT  * "
				+ "WHERE"
				+ " { ?s  a  ex:Client ."
                        
				+ " ?s ex:hasFirstName ?firstName "
				+ " OPTIONAL" 
				+ "    { ?firstName  ex:hasValue  ?o } ." 

                                + " ?s ex:hasLastName ?lastName "
				+ " OPTIONAL"
                                + "    { ?lastName  ex:hasValue  ?o1 } ." 
				
                                + " ?s ex:hasBdDate ?bdProperty "
				+ " OPTIONAL" 
				+ "    { ?bdProperty  ex:hasValue  ?bd } ."
	
                                + " ?s ex:hasDriverLicense ?drvLProperty "
				+ " OPTIONAL" 
				+ "    { ?drvLProperty  ex:hasDeliveryDate  ?PdelevryDate } ."
				+ "         OPTIONAL" 
				+ "             { ?PdelevryDate  ex:hasValue  ?delevryDate } ."
                        
				+ "}";

		Query qry = QueryFactory.create(query);
		readOnthologie("src/Prv.owl");
		QueryExecution exe = QueryExecutionFactory.create(qry, ontModel);
		ResultSet rs = exe.execSelect();
		System.out.println("begin");
		while (rs.hasNext()) {
			QuerySolution querySolution = (QuerySolution) rs.next();
			try{
			String myFirstName =""+querySolution.get("o").toString().replace("http://www.semanticweb.org/home/ontologies/2016/10/ex#", "ex:");
			String myLastName =""+querySolution.get("o1").toString().replace("http://www.semanticweb.org/home/ontologies/2016/10/ex#", "ex:");
			String myBirthDate =""+querySolution.get("bd").toString().replace("http://www.semanticweb.org/home/ontologies/2016/10/ex#", "ex:");
			String delevryDate =""+querySolution.get("delevryDate").toString().replace("http://www.semanticweb.org/home/ontologies/2016/10/ex#", "ex:");

                        if(myFirstName.toLowerCase().equals(firstName.toLowerCase()) && myLastName.toLowerCase().equals(lastName.toLowerCase())){
                            System.out.println("First Name : "+myFirstName+" Last Name : "+myLastName+" birth in : "+myBirthDate+"\n"
                                    + "licence delivred in : "+delevryDate);
                            
                            LocalDate today = LocalDate.now();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            LocalDate ldBirthDate = LocalDate.parse(myBirthDate,formatter);
                            LocalDate delevryPermis = LocalDate.parse(delevryDate, formatter);
                            long age = ChronoUnit.YEARS.between(ldBirthDate, today);
                            if(age<25 || age>75) {JOptionPane.showMessageDialog(null, "To rent a vehicle your age must be\nbetween [25,75]");} else
                            if(age<18) {JOptionPane.showMessageDialog(null, "people under 18 years old doesn't have a driver license");}else{
                                
                                long currentPassedTime = ChronoUnit.MONTHS.between(delevryPermis, today);
                                if (currentPassedTime<12) {
                                JOptionPane.showMessageDialog(null, "Period of validity of a driver's license\nmust be at least 12 months.");
                                    
                                } else {
                                JOptionPane.showMessageDialog(null, "Your age is accepted : you'r allowed to rent a vehicle");}
                                }
                                
                        }
			}
			catch(NullPointerException e){
				//Do nothing
				e.printStackTrace();
			}
		}
		exe.close();
		// return "";
	}

}