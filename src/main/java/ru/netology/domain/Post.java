package ru.netology.domain;

public class Post {
    private int postID;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private boolean friendsOnly;
    private String postType;
    private int signerID;
    private boolean canPin;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private boolean postponedID;

    private CommentsInfo commentsInfo;
    private Like like;
    private Location location;
    private Place place;
    private PostSou postSou;
    private Repost repost;
    private User user;
    private View view;

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public PostSou getPostSou() {
        return postSou;
    }

    public void setPostSou(PostSou postSou) {
        this.postSou = postSou;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAd(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isPostponedID() {
        return postponedID;
    }

    public void setPostponedID(boolean postponedID) {
        this.postponedID = postponedID;
    }
}
