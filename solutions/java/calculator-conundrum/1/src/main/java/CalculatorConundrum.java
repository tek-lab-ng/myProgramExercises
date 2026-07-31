class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        //throw new UnsupportedOperationException("Please implement the CalculatorConundrum.calculate() method");
        String value = null;
            if(operation == null){
                throw new IllegalArgumentException("Operation cannot be null");
            } else if(operation.equals("")){
                throw new IllegalArgumentException("Operation cannot be empty");
            } else if(operation.equals("+")){
                int total = operand1 + operand2;
                return value = operand1 + " " + operation + " " + operand2 + " " + "=" + " "+ total;
            } else if(operation.equals("/")){
                try{
                        if(operand2 <= 0){
                            throw new ArithmeticException();
                        } else {
                        int total = operand1 / operand2;
                        return value = operand1 + " " + operation + " " + operand2 + " " + "=" + " "+ total;
                        }
                } catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                    }
                  
            } else if(operation.equals("*")){
                int total = operand1 * operand2;
                return value = operand1 + " " + operation + " " + operand2 + " " + "=" + " "+ total;
            } else {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
    }
}
