package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class User {
    static ArrayList<User> users = new ArrayList<>();

    private String fullName;
    private String email;
    private String password;
    private String role;
    private int totalPoints;
    private int currentPoints;
    private int totalBadges;
    private int currentBadges;
    private PictureContainer pictureContainer;
    private ProfileContainer profileContainer;

    public User() {
    }

    public User(String fullName, String email, String password, String role, int totalPoints, int currentPoints, int totalBadges, int currentBadges, PictureContainer pictureContainer, ProfileContainer profileContainer) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.totalPoints = totalPoints;
        this.currentPoints = currentPoints;
        this.totalBadges = totalBadges;
        this.currentBadges = currentBadges;
        this.pictureContainer = pictureContainer;
        this.profileContainer = profileContainer;
        users.add(this);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public int getTotalBadges() {
        return totalBadges;
    }

    public void setTotalBadges(int totalBadges) {
        this.totalBadges = totalBadges;
    }

    public int getCurrentBadges() {
        return currentBadges;
    }

    public void setCurrentBadges(int currentBadges) {
        this.currentBadges = currentBadges;
    }

    public PictureContainer getPictureContainer() {
        return pictureContainer;
    }

    public void setPictureContainer(PictureContainer pictureContainer) {
        this.pictureContainer = pictureContainer;
    }

    public ProfileContainer getProfileContainer() {
        return profileContainer;
    }

    public void setProfileContainer(ProfileContainer profileContainer) {
        this.profileContainer = profileContainer;
    }

    public static User login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static ArrayList<User> getOrderedUsers() {
        // Get all users ordered by currentPoints
        ArrayList<User> orderedUsers = new ArrayList<>();
        for (User user : users) {
            int index = 0;
            for (int i = 0; i < orderedUsers.size(); i++) {
                if (user.getCurrentPoints() > orderedUsers.get(i).getCurrentPoints()) {
                    index = i;
                    break;
                }
            }
            orderedUsers.add(index, user);
        }
        return orderedUsers;
    }
}