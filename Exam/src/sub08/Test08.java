package sub08;

import java.util.HashMap;
import java.util.Map;

class User {
	private String uid;
    private String name;
    private int age;
    
    public String getUid() {return uid;}
    public String getName() {return name;}
    public int getAge() {return age;}

    public User(String uid, String name, int age) {
    	this.uid = uid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
    	return String.format("아이디 : %s"
    						 + "이름 : %s, "
    						 + "나이 : %d\n", uid, name, age);
    }
}

class UserMap {
    private Map<String, User> users;

    public UserMap() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUid(), user);
    }

    public boolean removeUser(String uid) {
        if (users.containsKey(uid)) {
            users.remove(uid);
            return true;
        }

        System.out.printf("아이디 '%s'가 존재하지 않습니다.\n", uid);
        return false;
    }

    public void showAllUsers() {
        for(User user : users.values()) {        	
        	System.out.printf("%s, %s, %d\n", user.getUid(),
                                              user.getName(),
                                              user.getAge());
        }
    }
}

public class Test08 {
	public static void main(String[] args) {
		
		UserMap map = new UserMap();
		
		User user1 = new User("a101", "김유신", 23);
        User user2 = new User("a102", "김춘추", 21);
        User user3 = new User("a103", "장보고", 31);
        User user4 = new User("a104", "강감찬", 42);
        User user5 = new User("a105", "이순신", 53);
        
        map.addUser(user1);
        map.addUser(user2);
        map.addUser(user3);
        map.addUser(user4);
        map.addUser(user5);
        
        map.removeUser("kim");
        map.removeUser("a103");
        
        map.showAllUsers();
	}
}