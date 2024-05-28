public class ServiceSearch {

    public boolean servisSearch(Director dir, String name) {
        for(var sr : dir.employees){
            System.out.println(sr);
            if(sr.getFirstName().equals(name)){
                System.out.println(sr.getFirstName());
                return true;
            } else if ((sr.getRole().equals(Positions.DIRECTOR))) {
                servisSearch((Director)sr,name);
                return true;
            }
        }
        return false;
    }
}
