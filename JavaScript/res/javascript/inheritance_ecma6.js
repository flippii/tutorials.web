class Point2D {
    constructor (x, y) {
        this.move(x, y);
    }
    move (x, y) {
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point2D {
    constructor (x, y, z) {
        super();
        this.move(x, y, z);
    }
    move (x, y, z) {
        super.move(x, y);
        this.z = z;
    }
}
var point3d = new Point3D(5, 3, 6);
console.log(point3d.x); // => 5
console.log(point3d.z); // => 6