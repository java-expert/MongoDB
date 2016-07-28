import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class First {
	   public static void main( String args[] ) {
			
		      try{
				
		         // To connect to mongodb server
		         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
					
		         // Now connect to your databases
		         DB db = mongoClient.getDB( "test" );
		         DBObject obj = new BasicDBObject();
		         obj.put( "foo", "bar" );
		         System.out.println(db.getCollectionNames());
		         //db.createCollection("10",obj);
		         
		         DBCollection coll = db.getCollection("1111111111");					

		       
		         DBCollection dbc= db.getCollection("10");
		         DBObject myDoc = dbc.findOne();
		         System.out.println("doc to be removed"+myDoc);
		         //dbc.remove(myDoc);
		         BasicDBObject doc = new BasicDBObject("title", "jj").
		                 append("description", "database").
		                 append("likes", 100);
		                 		         //boolean auth = db.authenticate(myUserName, myPassword);
		         //System.out.println("Authentication: "+auth);
		         dbc.insert(doc);
		         
		         DBCursor cursor = dbc.find();
		         int i = 1;
					
		         while (cursor.hasNext()) { 
		            System.out.println("Inserted Document: "+i); 
		            System.out.println(cursor.next()); 
		            i++;
		         }
		      }catch(Exception e){
		         System.out.println( "eee"+e );
		      }
		   }

}
