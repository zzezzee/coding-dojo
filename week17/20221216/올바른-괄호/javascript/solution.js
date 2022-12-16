function solution(s) {
  let count = 0;
    
  if(s.charAt(s.length - 1) == '('){
    return false;
  }

  for (let i = 0; i < s.length; i += 1) {
    if (s.charAt(i) == '(') {
      count += 1;
    }
    if (s.charAt(i) == ')') {
      count -= 1;
    }
    if (count == -1) {
      return false;
    }
  }

  return count == 0;
}
