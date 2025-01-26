package Colleague;

import mediator.Auction;
import mediator.AuctionMediator;

public class Bidder implements Colleague{
    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(String message) {
        System.out.println("Received bid notification: " + name + ":"+message);
    }

    public String getName() {
        return name;
    }
}
