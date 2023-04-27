import java.util.*;

class resrurent_review_string {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        String[] reviews = new String[n];
        for (int i = 0; i < n; i++) {
            reviews[i] = scanner.nextLine();
        }

        Set<String> goodWords = new HashSet<>();
        String[] goodWordsArray = scanner.nextLine().split(" ");
        for (String goodWord : goodWordsArray) {
            goodWords.add(goodWord);
        }

        Map<String, Integer> reviewToGoodWordsCount = new HashMap<>();
        for (String review : reviews) {
            int count = 0;
            String[] words = review.split(" ");
            for (String word : words) {
                if (goodWords.contains(word)) {
                    count++;
                }
            }
            reviewToGoodWordsCount.put(review, count);
        }

        Arrays.sort(reviews, (r1, r2) -> {
            int count1 = reviewToGoodWordsCount.get(r1);
            int count2 = reviewToGoodWordsCount.get(r2);
            if (count1 != count2) {
                return Integer.compare(count2, count1);
            } else {
                return 0;
            }
        });

        for (String review : reviews) {
            System.out.println(review);
        }
    }
}