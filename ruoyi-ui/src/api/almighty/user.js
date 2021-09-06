import request from '@/utils/request'

// 查询用户管理列表
export function listUser(query) {
  return request({
    url: '/almighty/user/list',
    method: 'get',
    params: query
  })
}

// 查询用户管理详细
export function getUser(uId) {
  return request({
    url: '/almighty/user/' + uId,
    method: 'get'
  })
}

// 新增用户管理
export function addUser(data) {
  return request({
    url: '/almighty/user',
    method: 'post',
    data: data
  })
}

// 修改用户管理
export function updateUser(data) {
  return request({
    url: '/almighty/user',
    method: 'put',
    data: data
  })
}

// 删除用户管理
export function delUser(uId) {
  return request({
    url: '/almighty/user/' + uId,
    method: 'delete'
  })
}

// 导出用户管理
export function exportUser(query) {
  return request({
    url: '/almighty/user/export',
    method: 'get',
    params: query
  })
}