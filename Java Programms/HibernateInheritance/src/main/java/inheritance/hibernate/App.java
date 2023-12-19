package inheritance.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import inhertance.hibernate.model.Four_wheeler;
import inhertance.hibernate.model.Two_wheelers;
import inhertance.hibernate.model.Vehicles;




public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         
         try 
         {
         	Vehicles vehicle=new Vehicles();
         	vehicle.setVehicleName("Lamborghini");
         	
         	Two_wheelers bike=new Two_wheelers();
         	bike.setVehicleName("Bajaj");
         	bike.setSteeringHandle("Bajaj steering Handle");
         	
         	Four_wheeler car=new Four_wheeler();
         	car.setVehicleName("Mahindra");
         	car.setSteeringWheel("Mahindra Steering wheel");
         	
         	session.save(vehicle);
         	session.save(bike);
         	session.save(car);
         	
         	session.getTransaction().commit();
         		
         }
         finally 
         {
         	 session.close();
         	 sessionFactory.close();
         }

    }
}
