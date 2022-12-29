function test() {
  console.log('remove(\'b\', [\'b\']) : [] = '
    + remove('b', ['b']));
  console.log('remove(\'d\', [\'c\']) : [c,d] = '
    + remove('d', ['c']));
  
  console.log('solution(\'baabaa\') : 1 = '
    + solution('baabaa'));
  console.log('solution(\'cdcd\') : 0 = '
    + solution('cdcd'));
}

function solution(s)
{
  const stack = [];
    
  s.split('').forEach(element => remove(element, stack));
    
  return stack.length === 0 ? 1 : 0;
}

function remove(element, stack) {
  if (stack.length !== 0 && stack[stack.length - 1] === element) {
    stack.pop();

    return stack;
  }
  if(stack.length === 0 || stack[stack.length - 1] !== element) {
    stack.push(element);

    return stack;
  }
}

test();
