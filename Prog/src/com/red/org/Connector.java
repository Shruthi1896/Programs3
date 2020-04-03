package com.red.org;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Connector {

	public static void main(String[] args) {		  
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Prog" );
         EntityManager em = emf.createEntityManager( );
		   em.getTransaction().begin();

                Books b=new Books();
				 b.setBook_id(001);
				 b.setBook_name("cse");
					em.persist(b); 

				 Books b1=new Books();
				 b1.setBook_id(002);
				 b1.setBook_name("pom");
					em.persist(b); 
					
			           ArrayList<Books> list=new ArrayList<Books>();  
			           list.add(b);  
			           list.add(b1
			        		   
			        		   
			        		   );  
			           
						Student s= new Student();
					    s.setId(100); 
						s.setName("nishii");
			            em.persist(s); 


				em.getTransaction().commit();
				em.close();
				
				emf.close();
				

					
	}

	

	}


