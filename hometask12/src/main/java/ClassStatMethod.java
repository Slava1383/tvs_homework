public class ClassStatMethod {
    public static boolean statMethod(String login, String password, String confirmPassword) {
        try {
            if(login.length() > 20 || login.contains(" ")){
                throw new WrongLoginException("Incorrect login.");
            }
            if(password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)){
                throw new WrongPasswordException("Incorrect password.");
            }
            return true;
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
