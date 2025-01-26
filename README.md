# AuctionSystem

Here's a detailed implementation of an online auction/bidding system using the Mediator Pattern. 
This design ensures that the AuctionMediator acts as a central hub, 
coordinating interactions between Bidder instances without them directly interacting with each other.

##Low-Level Design
###Components:

  Colleague Interface:
    Represents a participant in the auction system.
  Methods:
    placeBid(int amount) — to place a bid.
    receiveBidNotification(String message) — to receive notifications about auction updates.
  Bidder Class:
    Implements Colleague.
    Represents a bidder in the system.
  Contains:
    name: Name of the bidder.
    auctionMediator: Instance of AuctionMediator to communicate with the auction.
    Overrides placeBid and receiveBidNotification.
  AuctionMediator Interface:
    Central mediator for managing communication between bidders.
  Methods:
    addBidder(Bidder bidder) — to add bidders to the auction.
    placeBid(Bidder bidder, int bidAmount) — to place a bid and notify all bidders.
  Auction Class:
    Implements AuctionMediator.
  Contains:
    List of bidders.
    Tracks the highest bid and bidder.
    Overrides methods to manage bidders and bids.


###Improvement:
  what if auction can be of different strategy: eg time based auction, value based auction, All-In Strategy etc.
