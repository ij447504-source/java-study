package ex08;

class Service{

    static void loginProcess(String username, String password){ //3
        if(username.length() < 5){ //4
            throw new RuntimeException("Username의 길이가 짧아요 ");
        }
        if(!password.equals("1234")){ //! 아니면 걸려라!
           throw new RuntimeException("password가 틀렸어요 ");

        }

    }
}
// SRP 잘못된 처리를 하는 곳 //5_오류가 발생하는 경우 호출돼야하는데 여기서 안되면 찾아다님
class Controller{
    static void login(String username, String password){ //1
        try {
            Service.loginProcess(username, password); //2
        } catch (RuntimeException e){
            System.out.println(e.getMessage());

        }
    }
}

public class Try03 {
    public static void main(String[] args) {
        Controller.login("ssar","1234");

    }
}
