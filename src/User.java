public class User {
    //properties
    private int rank;
    private int progress;

    //constructor
    public User(){
        rank = -8;
        progress = 0;
    }

    //behavior
    public int getRank(){
        return rank;
    }

    public int getProgress(){
        return progress;
    }

    public void incProgress(int level){
        if (level<-8||level==0||level>8){
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");

        }
        int difference = level-rank;
        if (level>0&&rank<0){
            difference--;
        } else if (level<0&&rank>0) {
            difference++;
        }
        if (difference < -1){
            progress+=0;
        } else if (difference==-1) {
            progress += 1;
        } else if (difference == 0) {
            progress += 3;
        } else if (difference > 0) {
            progress += (difference*difference*10);
        }
        while (progress>=100){
            rank++;
            progress -= 100;
        }
        if (rank == 0){
            rank++;
        }
    }

    public String toString(){
        return ("User{rank=" + rank + ", progress=" + progress + "}");
    }
}
