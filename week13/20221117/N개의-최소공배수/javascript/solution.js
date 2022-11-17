function test() {
    console.log(`gcd(6, 4): 2 = ${gcd(6, 4)}`)
    console.log(`lcm(6, 4): 12 = ${lcm([6, 4])}`)
    console.log(`lcm(6, 4, 2): 12 = ${lcm([6, 4, 2])}`)
    console.log(`solution(6, 4, 2): 12 = ${solution([6, 4, 2])}`)
}

function solution(num) {
 return lcm(num);
}

function lcm(arr) {
  return arr.reduce((acc, cur) => (acc * cur / gcd(acc, cur)));
}

function gcd(x, y) {
    let max = Math.max(x, y);
    let min = Math.min(x, y);
    
    while(max % min != 0) {
        const r = max % min;
        max = min;
        min = r;
    }
    
    return min;
}

test()
