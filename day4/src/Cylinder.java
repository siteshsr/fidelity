
    class Cylinder extends Shape {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }
        double calculateVolume() {
            return Math.PI * radius * radius * height;
        }
    }

