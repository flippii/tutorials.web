var Point2D = function (x, y) {
    this.move(x, y);
};
Point2D.prototype.move = function (x, y) {
    this.x = x;
    this.y = y;
};
var Point3D = function (x, y, z) {
    Point2D.call(this, x, y);
    this.move(x, y, z);
};
Point3D.prototype = Object.create(Point2D.prototype);
Point3D.prototype.constructor = Point3D;
Point3D.prototype.move = function (x, y, z) {
	Point2D.prototype.move(x, y);
	this.z = z;
}
var point3d = new Point3D(5, 3, 6);
console.log(point3d.x); // => 5
console.log(point3d.z); // => 6