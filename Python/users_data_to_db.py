import mysql.connector
from mysql.connector import Error
from mysql.connector import connection

# This code can upload any data to mySQL database

class mySQL_client:

    def __init__(self,host, database, user, password):
        self.host = host
        self.database = database
        self.user = user
        self.password = password

    def connect_to_database(self):
        try:
            connection = mysql.connector.connect(host=self.host,
                                                database=self.database,
                                                user=self.user,
                                                password=self.password)
            if connection.is_connected():
                db_Info = connection.get_server_info()
                print("Connected to MySQL Server version ", db_Info)
                cursor = connection.cursor()
                cursor.execute("select database();")
                record = cursor.fetchone()
                print("You're connected to database: ", record)
            else:
                print("Already you have connected to the database or you have any problem")

        except Error as e:
            print("Error while connecting to MySQL", e)
        finally:
            if connection.is_connected():
                cursor.close()
        return connection

    def unconnect_from_database(self):
            connection.close()

    def add_user(self):

        connection1 = self.connect_to_database()
        mycursor = connection1.cursor()
        x = input("Enter you name :")
        try:
            #Execute SQL Query to insert record  
            mycursor.execute("insert into users (username) values ('"+x+"')")  
            connection1.commit() # Commit is used for your changes in the database  
            print('Record inserted successfully...')  
        except:
            # rollback used for if any error   
            connection1.rollback()  
            connection1.close()#Connection Close
        finally:
            connection1.close()
    
    def update_user(self):

        connection1 = self.connect_to_database()
        mycursor = connection1.cursor()
        username = input("Enter your new username :")
        id = input("Enter your account id :")
        try:
            #Execute SQL Query to insert record  
            mycursor.execute("update users set username = '"+username+"' where id = '"+id+"'")  
            connection1.commit() # Commit is used for your changes in the database  
            print('Record updates transaction successfully...')  
        except:
            # rollback used for if any error   
            connection1.rollback()  
            connection1.close()#Connection Close
        finally:
            connection1.close()
            
    def delete_user(self):
        connection1 = self.connect_to_database()
        mycursor = connection1.cursor()
        id = input("Enter id for delete user transaction :")
        try:
            #Execute SQL Query to insert record  
            mycursor.execute("delete from users where id = '"+id+"'")  
            connection1.commit() # Commit is used for your changes in the database  
            print('Record updates transaction successfully...')  
        except:
            # rollback used for if any error   
            connection1.rollback()  
            connection1.close()#Connection Close
        finally:
            connection1.close()




project_02 = mySQL_client("host:YOUR_HOST", "database:YOUR_DATABASE_NAME", "username:YOUR_USER_NAME", "password:YOUR_PASSWORD")



project_02.add_user()


                








