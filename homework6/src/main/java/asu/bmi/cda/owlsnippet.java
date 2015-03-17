package asu.bmi.cda;



import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import java.util.List;

/**
 * Created by mhchowd1 on 3/16/2015.
 */
public class owlsnippet {

    static String BMI591 = "http://edu.asu.bmi/cad591/moinul/skos/ext#";
    static String name = "bmiVocabulary";
    static String prefix = "skos:";


public static void main(String[] args) throws OWLOntologyCreationException, OWLException {

    String code = null;
    List<String> labels = null;
    List<IRI> parents = null;
    OWLOntology ontology = null;

    OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
    ontology = manager.loadOntologyFromOntologyDocument(
// the relative path to your file, where "/" corresponds to
            //src/main/resources
            manager.getClass().getResourceAsStream("/ontology.owl")
    );
    OWLDataFactory factory = manager.getOWLDataFactory();
    manager.saveOntology(ontology, System.err);


    //instantiate or looks up an individual with given IRI
    OWLNamedIndividual ind = factory.getOWLNamedIndividual(
        IRI.create(BMI591 + name)
);
    //instantiate relationship between two individuals
    //adding event isA subTypeOf broaderTransitive
    OWLObjectPropertyAssertionAxiom opa = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"broaderTransitive")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"event")) //object
    );

    //adding abuse isA subTypeOf event
    OWLObjectPropertyAssertionAxiom opa1 = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"event")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"abuse")) //object
    );

    //adding death isA subTypeOf event
    OWLObjectPropertyAssertionAxiom opa2 = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"event")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"death")) //object
    );

    //adding bioterrorism isA subTypeOf event
    OWLObjectPropertyAssertionAxiom opa3 = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"event")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"bioterrorism")) //object
    );
    //adding overexertion isA subTypeOf event
    OWLObjectPropertyAssertionAxiom opa4 = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"event")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"overexertion")) //object
    );
    //adding killing isA subTypeOf event
    OWLObjectPropertyAssertionAxiom opa5 = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
            factory.getOWLNamedIndividual( IRI.create(prefix+"event")), //subject
            factory.getOWLNamedIndividual(IRI.create(prefix+"killing")) //object
    );


    //instantiate data property (attribute) of an individual
    OWLLiteral value = factory.getOWLLiteral("abuse+by relative");
    OWLDataPropertyAssertionAxiom oda = factory.getOWLDataPropertyAssertionAxiom(
            factory.getOWLDataProperty(IRI.create(prefix+"subTypeOf")),
            factory.getOWLNamedIndividual(IRI.create("abuse")),
            value);






    manager.addAxiom(ontology,factory.getOWLDeclarationAxiom(ind));
    manager.addAxiom(ontology,opa);
    manager.addAxiom(ontology,opa1);
    manager.addAxiom(ontology,opa2);
    manager.addAxiom(ontology,opa3);
    manager.addAxiom(ontology,opa4);
    manager.addAxiom(ontology,opa5);
    manager.addAxiom(ontology, oda);

    manager.saveOntology(ontology, System.err);

    ReasonerHelper helper = new ReasonerHelper();

    OWLAxiom axiomTester;
    helper.makeInferences(ontology);

    }

    public void addCodedConcept(IRI id,
                                String code,
                                List<String> labels,
                                List<IRI> parents,
                                OWLOntology ontology)

        throws OWLOntologyStorageException, OWLOntologyCreationException{
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        ontology = manager.loadOntologyFromOntologyDocument(
// the relative path to your file, where "/" corresponds to
                //src/main/resources
                manager.getClass().getResourceAsStream("/ontology.owl")
        );
        OWLDataFactory factory = manager.getOWLDataFactory();
        manager.saveOntology(ontology, System.err);

    }
    public void addRelationship(
            IRI subject,
            IRI property,
            IRI object,
            OWLOntology ontology ) {

    }


public static OWLOntology getPopulatedOntology(OWLOntology ontology){
    return ontology;
}

}
