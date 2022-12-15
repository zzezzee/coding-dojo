function test() {
  console.log('split(\'3people  unFollowed me\') : 3people,,unfollowed,me = '
    + split("3people  unFollowed me"))
  
  console.log('toUpperCase([3people,,unfollowed,me]) : [3people, ,Unfollowed, Me] = '
    + toUpperCase(['3people', '', 'unfollowed', 'me']))
  
  console.log('join([3people,,Unfollowed, Me]) : \'3people Unfollowed Me\' = '
   + join(['3people','','Unfollowed','Me']))
}

function solution(s) {
  return join(toUpperCase(split(s)));
}

function split(s) {
  return s.toLowerCase().split(' ');
}

function toUpperCase(words) {
  return words.map(word => word.charAt(0).toUpperCase() + word.substring(1))
}

function join(words) {
  return words.join(' ');
}

test()
