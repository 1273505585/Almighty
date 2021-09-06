import request from '@/utils/request'

// 查询二手物品列表
export function listGoods(query) {
  return request({
    url: '/almighty/goods/list',
    method: 'get',
    params: query
  })
}

// 查询二手物品详细
export function getGoods(goodsId) {
  return request({
    url: '/almighty/goods/' + goodsId,
    method: 'get'
  })
}

// 新增二手物品
export function addGoods(data) {
  return request({
    url: '/almighty/goods',
    method: 'post',
    data: data
  })
}

// 修改二手物品
export function updateGoods(data) {
  return request({
    url: '/almighty/goods',
    method: 'put',
    data: data
  })
}

// 删除二手物品
export function delGoods(goodsId) {
  return request({
    url: '/almighty/goods/' + goodsId,
    method: 'delete'
  })
}

// 导出二手物品
export function exportGoods(query) {
  return request({
    url: '/almighty/goods/export',
    method: 'get',
    params: query
  })
}