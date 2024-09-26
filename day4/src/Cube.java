
    class Cube extends Shape {
        private double side;


        public Cube(double side) {
            this.side = side;
        }


        double calculateVolume() {
            return side * side * side;
        }
    }
