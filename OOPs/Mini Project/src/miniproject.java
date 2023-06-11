import java.util.Scanner;

//video rental system
public class miniproject{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        videostrore v = new videostrore();
        int choice;
        while(true){

				System.out.println("MAIN MENU \n=========");
				System.out.println("1. Add Videos:");
				System.out.println("2. Check Out Video:");
				System.out.println("3. Return Video:");
				System.out.println("4. Receive Rating:");
				System.out.println("5. List Inventory:");
				System.out.println("6. Exit:");
				System.out.print("Enter your choice(1..6): ");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter the name of the video you want to add:");
                        v.addvideo(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter the name of the video you want to checkout:");
                        v.docheckout(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter the name of the video you want to return:");
                        v.doreturn(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter the name of the video you want to rate and its rating:");
                        v.recieverating(sc.next(), sc.nextInt());
                        break;
                    case 5:
                        v.listinventory();
                        break;
                    case 6:
                        System.exit(1);
                        break;
                }

        }
    }
}
class video{
    public String videoname;
    private boolean checkout;
    private int rating;
    public String getname(){
        return videoname;
    }
    void docheckout(){
        checkout = true;
    }
    void doreturn(){
        checkout =false;
    }
    void recieverating(int rating){
        this.rating = rating;
    }
    int getrating(){
        return rating;
    }
    boolean getcheckout(){
        return checkout;
    }
    video(String name){
        this.videoname = name;
    }
}
class videostrore{
    video[] store = new video[5];
    void addvideo(String name){
        store[0] = new video(name);
        System.out.println("Video added successfully");
    }
    void docheckout(String name){
        if(store[0].videoname.equals(name))
            store[0].docheckout();
    }
    public void doreturn(String name){
        if(store[0].videoname.equals(name))
            store[0].doreturn();
    }
    public void recieverating(String name, int rating){
        if(store[0].videoname.equals(name)){
            store[0].recieverating(rating);
            System.out.println("Rating added successfully");
        }
    }
    public void listinventory(){
        System.out.println("------------------------------------------");
		System.out.println("Video Name | Checkout Status | Rating");
		System.out.println(store[0].getname()+"|" +store[0].getcheckout()+ "|"+ store[0].getrating());
		System.out.println("------------------------------------------");
    }
    
}
