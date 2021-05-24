//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.3 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.05.20 às 02:23:39 AM BRT 
//


package com.bfyamada.budget.core.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bfyamada.budget.core.dto package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bfyamada.budget.core.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBudgetRequest }
     * 
     */
    public GetBudgetRequest createGetBudgetRequest() {
        return new GetBudgetRequest();
    }

    /**
     * Create an instance of {@link GetBudgetResponse }
     * 
     */
    public GetBudgetResponse createGetBudgetResponse() {
        return new GetBudgetResponse();
    }

    /**
     * Create an instance of {@link Budget }
     * 
     */
    public Budget createBudget() {
        return new Budget();
    }

}
