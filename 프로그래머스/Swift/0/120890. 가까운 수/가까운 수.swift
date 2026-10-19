import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    var closer: Int = array[0]
    var mindiff: Int = abs(closer - n)
    for i in array {
        var value: Int = abs(n - i)
        if value < mindiff {
            mindiff = value
            closer = i
        }
        else if value == mindiff && i < closer {
            closer = i
        }
    }
    return closer
}