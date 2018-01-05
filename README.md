#zillow_interview


Build with in Java using below architecture.

main components used:
Gradle
Mevin
Hibernate
PostgresSQL
Restful Services


Sorting Algorithm:

```java
public static Comparator<People> FirstNameComparator  = new Comparator<People>() {
			public int compare(People p1, People p2) {
				String item1 = p1.getFirstName().toUpperCase();
				String item2 = p2.getFirstName().toUpperCase();
				if(sortType.equals("true")){
					return item1.compareTo(item2);
				}else{
					return item2.compareTo(item1);
				}
				}
	};
```

Back End assumption: Using a traditional fast way to sort objects.

Start on your local: 
run commands in your terminal project space.
1.eclipse/netBeans
2.install jetty from marketplace
3. run postgres on port 5432
4. configure hiernate connection credentials
5. run porject on jetty.

6. test files are provided for local testing. 


Deployment: on an EC2 server
1. install postgres on server
2. set db credentials and security

3. install java sdk and jre
4. install gradle
5. install SDKman
6. install git-all
7. install jetty-distribution
8. install and configure jetty-runner
9. run sudo gradle build in project space to generarte war file or SFTP it into the instance
10. run java jetty-runner -jar --port 80 .war
