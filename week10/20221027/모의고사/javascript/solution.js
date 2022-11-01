export function getSupojaArray() {
    return [
    [1, 2, 3, 4, 5]
    , [2, 1, 2, 3, 2, 4, 2, 5]
    , [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
  ]
}

export const collectAnswer = (supojaArray, answers) => {
  return supojaArray.map(i => compare(i, answers))
}

export const compare = (supoja, answers) => {
  let collectNumber = 0;

  answers.filter((i, index) => i === supoja[index % supoja.length] ? collectNumber += 1 : collectNumber)
  return collectNumber
}

export const findSmartSupoja = (numberOfCollectAnswer) => {
  const max = Math.max.apply(null, numberOfCollectAnswer)

  const result = numberOfCollectAnswer.map((_, index) => index)
    .filter((i) => numberOfCollectAnswer[i] === max)
    .map(i => i + 1);

  return result
}

export function solution(answers) {
  const supojaArray = getSupojaArray();

  const numberOfCollectAnswer = collectAnswer(supojaArray, answers);

  const smartSupoja = findSmartSupoja(numberOfCollectAnswer);

  return smartSupoja;
}