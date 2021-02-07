package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.Airtel;
import com.aman.beans.College;
import com.aman.beans.FacultyInfo;
import com.aman.beans.FruitStore;
import com.aman.beans.ShoeFactory;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		
	      DefaultListableBeanFactory factory = null;
	      XmlBeanDefinitionReader reader = null;
	      ShoeFactory sfactory = null;
	      College college  = null;
	      Airtel airtel = null;
	      FacultyInfo fino = null;
	      FruitStore fstore = null;
	      
	      //create IOContainer
	      factory = new DefaultListableBeanFactory();
	      reader = new XmlBeanDefinitionReader(factory);
	      reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
	      
	      //Create Object For Target Class
	      sfactory = factory.getBean("sFactory",ShoeFactory.class);
	      System.out.println(sfactory);
	      
	      //Create Object For College Class
	      college = factory.getBean("clg", College.class);
	      System.out.println(college);
	      
	      //Get Airtel ClassObject
	      airtel = factory.getBean("airtel" , Airtel.class);
	      System.out.println(airtel);
	      
	      //Get Faculty Class Object
	      fino = factory.getBean("ft",FacultyInfo.class);
	      System.out.println(fino);
	      
	      //Get FruitStore Class Object
	      fstore = factory.getBean("fst", FruitStore.class);
	      System.out.println(fstore);
          
	}

}
