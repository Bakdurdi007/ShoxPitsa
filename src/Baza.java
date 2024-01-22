public class Baza {
    private static final String[] UserPhoneNumber = new String[10000];
    private static final String[] UserName = new String[10000];
    private static final String[] UserLocation = new String[10000];
    private static final String[][] UserOrderList = new String[10000][5];

    private static int OrederCounts = 0;

    public String getUserPhoneNumber(int id) {
        return UserPhoneNumber[id];
    }

    public void setUserPhoneNumber(String userPhoneNumber, int id) {
        UserPhoneNumber[id] = userPhoneNumber;
    }

    public String getUserName(int id) {
        return UserName[id];
    }

    public void setUserName(String userName, int id) {
        UserName[id] = userName;
    }

    public String getUserLocation(int id) {
        return UserLocation[id];
    }

    public void setUserLocation(String userLocation, int id) {
        UserLocation[id] = userLocation;
    }

    public String getUserOrderList(int row, int col) {
        return UserOrderList[row][col];
    }

    public void setUserOrderList(String userOrderList, int row, int col) {
        UserOrderList[row][col] = userOrderList;
    }

    public int getOrederCounts() {
        return OrederCounts;
    }

    public void setOrederCounts(int orederCounts) {
        OrederCounts = orederCounts;
    }
}
