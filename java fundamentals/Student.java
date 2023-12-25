class Student {
    public int id;
    public String name;
    public String address;

    void showDetails(){
        System.out.println( "name=" + this.name);
        System.out.println( "address=" + this.address);
        System.out.println("id=" + this.id);
    }

    public static void main(String args[]){
        Student st1 = new Student();
        st1.name = "devesh";
        st1.address = "shivaji nagar";
        st1.id = 70;
        st1.showDetails();
    }
}