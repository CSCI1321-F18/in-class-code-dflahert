package basics

class HitBox {
  private var cx: Double = 0.0 //cx and cy represent that the (x,y) coordinate is in the middle of our box
  private var cy: Double = 0.0
  val width: Double = 1.0
  val height: Double = 1.0

  def intersects(other: HitBox): Boolean = {
    val overlapX = (cx - other.cx).abs < 0.5 * (width + other.width)
    val overlapY = (cy - other.cy).abs < 0.5 * (height + other.height)
    overlapX && overlapY
    
  }
}