function solution(n, words) {
  for (let i = 0; i < words.length; i++) {
    if (i === 0) {
       continue;
    }
    
    let prevWord = words[i - 1];
    let prevLast = prevWord[prevWord.length - 1];
    let currFirst = words[i][0];
    
    if ((words.indexOf(words[i]) !== i) || (prevLast !== currFirst)) {         
      return [(i+1)%n || n, Math.ceil((i+1)/n)];
    }
  }   

  return [0, 0];
}
