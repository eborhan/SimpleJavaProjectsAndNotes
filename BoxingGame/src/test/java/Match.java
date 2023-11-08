public class Match {
    Fighter f1, f2;
    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            // This is how to use the added function below.//
            Fighter first = firstHit();
            System.out.println("First hit came from " + first.name);
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=========NEXT ROUND=========");
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }

                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Fighters are not in equal weight class!");
        }
    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);

    }

    // This is the function determining who would hit first at a 50% chance. //
    Fighter firstHit() {
        if (Math.random() * 10 < 5)
            return f1;
        else
            return f2;
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Winner: " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("=================");
        System.out.println(f1.name + "'s" + " remaining health    \t:" + f1.health);
        System.out.println(f2.name + "'s" + " remaining health    \t:" + f2.health);
    }

}