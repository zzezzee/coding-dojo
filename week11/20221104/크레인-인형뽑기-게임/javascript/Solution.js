function solution(board, moves) {
    var answer = 0;
  var arr = []
  
    for(var i = 0; i < moves.length; i++){
        for(var j = 0; j < board.length;j++){
            if(board[j][moves[i]-1] !== 0){
                arr.push(board[j][moves[i]-1])
                board[j][moves[i]-1] = 0
                break;
            }
        }
      
        if (arr.length >=2){
            if (arr[arr.length-1] === arr[arr.length-2]){
                answer +=2
                arr.splice(arr.length-2,2)

            }
        } 
    }
    return answer;
}
