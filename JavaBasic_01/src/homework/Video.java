package homework;

public class Video {
//- 片名
// - 是否被出租的标识
// - 用户的平均评分

    private String name;
    private boolean isRent;
    private int mark;//用户的平均评分
    private int markTimes; //用户评分次数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return isRent;
    }

    public boolean setRent(boolean rent) {
        //TODO
        this.isRent=rent;
        return rent;
    }

    public int getMark() {
        return mark;
    }

    public int getMarkTimes() {
        return markTimes;
    }

    public void setMarkTimes(int markTimes) {
        this.markTimes = markTimes;
    }

    public void setMark(int mark) {
        this.mark=(this.mark*this.markTimes+mark)/(this.markTimes+1);
        //TODO
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", isRent=" + isRent +
                ", mark=" + mark +
                ", markTimes=" + markTimes +
                '}';
    }
}
