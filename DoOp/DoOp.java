public class DoOp {
    public static String operate(String[] args) {
        if (args == null){
            return "Error";
        }

        if (args.length == 3) { // Expecting three arguments
            int leftOperand = Integer.parseInt(args[0]);
            String operation = args[1];
            int rightOperand = Integer.parseInt(args[2]);

            switch (operation) {
                case "+":
                    return String.valueOf(leftOperand + rightOperand);
                case "-":
                    return String.valueOf(leftOperand - rightOperand);
                case "*":
                    return String.valueOf(leftOperand * rightOperand);
                case "/":
                    if (rightOperand != 0) {
                        return String.valueOf(leftOperand / rightOperand);
                    } else {
                        return "Error";
                    }
                case "%":
                    if (rightOperand != 0) {
                        return String.valueOf(leftOperand % rightOperand);
                    } else {
                        return "Error";
                    }
                default:
                    return "Error";
            }
        } else if (args.length == 0) { // No arguments
            return "Error";
        } else {
            return "Error";
        }
    }
}
