export function solution(n, lost, reserve) {
  let realLost = lost.sort().filter((el) => !reserve.includes(el));
  let realReserve = reserve.sort().filter((el) => !lost.includes(el));

  return (
    n -
    realLost.filter((lostEl) => {
      let abs = realReserve.find((reserveEl) => Math.abs(lostEl - reserveEl) == 1);

      if (!abs) return true;

      realReserve = realReserve.filter((reserveEl) => reserveEl !== abs);
    }).length
  );
}