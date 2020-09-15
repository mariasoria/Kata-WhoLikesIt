public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String likesSentence = "";
        switch (names.length) {
            case 0:
                likesSentence = "no one likes this";
                break;
            case 1:
                likesSentence = names[0] + " likes this";
                break;
            case 2:
                likesSentence = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                likesSentence = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                int n = names.length - 2;
                likesSentence = names[0] + ", " + names[1] + " and " + n + " others like this";
                break;
        }
        return likesSentence;
    }
}
