class armstrong {
    public static void main(String[] args) {
        int num = 1593;
        int original = num;
        int sum = 0;
        int digit = 0;
        int temp = num;
        while (temp > 0) {
            digit++;
            temp /= 10;

        }
        temp = num;
        while (temp > 0) {
            int lastdigit = temp % 10;
            sum += Math.pow(lastdigit, digit);
            temp /= 10;
        }
        if (sum == original) {
            System.out.println(original + " " + "is armstrong number");
        } else {
            System.out.println(original + " " + "is not armstrong number");
        }
    }
}