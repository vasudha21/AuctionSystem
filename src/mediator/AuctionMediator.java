package mediator;

import Colleague.Bidder;

public interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder, int bidAmount);
}
