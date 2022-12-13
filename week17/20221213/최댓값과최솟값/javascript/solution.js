function test() {
    console.log('split("1 2 3 4") : [1, 2, 3, 4] = ' 
                + split("1 2 3 4"));
    console.log('findMin([1 2 3 4]) : 1 = ' 
                + findMin([1,2,3,4]))
    console.log('findMax([1 2 3 4]) : 4 = ' 
                + findMax([1,2,3,4]))
    console.log('combine(1, 4) : "1 4" = ' 
                + combine(1, 4))
        
}

function solution(s) {
    const arr = split(s);
    
    const min = findMin(arr);
    const max = findMax(arr);
    
    const result = combine(min, max)
    
    return result
}
    
function split(s) {
    return s.split(" ");
}

function findMax(arr) {
    return Math.max(...arr);
}

function findMin(arr) {
    return Math.min(...arr);
}

function combine(min, max) {
    return min + " " + max;
}

test();
