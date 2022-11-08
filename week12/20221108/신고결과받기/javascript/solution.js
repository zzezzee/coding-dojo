export default function solution(id_list, report, k) {
  const answer = new Array(id_list.length).fill(0);
  const set = new Set(report);
  const map = new Map();

  id_list.map((id) => {
    map.set(id, 0)
  })

  for (let i of set) {
    map.set(i.split(' ')[1], map.get(i.split(' ')[1]) + 1);
  }

  for (let i of set) {
    if (map.get(i.split(' ')[1]) >= k) {
       answer[id_list.indexOf(i.split(' ')[0])] += 1;
    }
 }

  return answer;
}
