import Colleague.Bidder;
import mediator.Auction;
import mediator.AuctionMediator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        AuctionMediator auction = new Auction();

        Bidder bidder1 = new Bidder("Vas", auction);
        Bidder bidder2 = new Bidder("Sam", auction);
        Bidder bidder3 = new Bidder("Ana", auction);

        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder3.placeBid(200);
        bidder1.placeBid(200);

        ((Auction) auction).announceWinner();
        }
}