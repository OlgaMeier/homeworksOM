package de.controlWork36Lesson;
import java.util.ArrayList;
public class User {

  /*  Инструкции:
            1.  Ознакомьтесь с кодом.
2.  Обратите внимание на стиль кодирования, именование переменных и методов, структуру
    кода, принципы ООП.
            3.  Выпишите все замечания, которые у вас возникли по коду, и предложите свои
    корректировки.
4.  Объясните причины ваших предложений*/


        private String user_name;
        private int age;
        ArrayList<String> friendsList = new ArrayList<>();
        public User(String name, int age) {
            this.user_name = name;
            this.age = age; // д.быть age, а не   name
        }

    public String getName() {
        return user_name;
    }

    public void setName(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*  было до исправления, исправила создав через конструктор гетеры и сетеры по правилам get b set  с маленьклй буквы и имена переменных не менять
    public String getUser_name() {
                return user_name;
            }
            public void setUser_name(String newName) {
                this.user_name = newName;
            }
            public int getAge() {
                return age;
            }
            public void setAge(int newAge) {
                age = newAge;
            }*/
        public void addFriend(String friendName) {
            friendsList.add(friendName);
        }
        public void removeFriend(String friendName) {
            friendsList.remove(friendName);
        }

    public ArrayList<String> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(ArrayList<String> friendsList) {
        this.friendsList = friendsList;
    }
        /*public ArrayList<String> GetFriends() {
            return friendsList;
        }*/

    }


