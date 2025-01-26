package mediator;

import Colleague.Bidder;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    private List<Bidder> bidders = new ArrayList<>();
    private int highestBid=0;
    private Bidder highestBidder = null;

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {

        if(bidAmount>highestBid){
            highestBid=bidAmount;
            highestBidder=bidder;

            for(Bidder b:bidders){
                if(b!=bidder){
                    b.receiveBidNotification(bidder.getName()+"placed a higher bid of"+bidAmount);
                }
            }
            System.out.println(bidder.getName()+"is now the highest bidder");
        }else{
            bidder.receiveBidNotification("your bid of"+bidAmount+"is less than current highest bid");
        }
    }

    public void announceWinner(){
        if(highestBidder!=null){
            System.out.println("auction winner"+highestBidder.getName());
        }else System.out.println("no bids were placed");
    }
}
