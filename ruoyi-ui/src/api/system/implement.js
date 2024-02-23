import request from '@/utils/request'

// 查询机具调拨记录列表
export function listImplement(query) {
  return request({
    url: '/system/implement/list',
    method: 'get',
    params: query
  })
}

// 查询机具调拨记录详细
export function getImplement(id) {
  return request({
    url: '/system/implement/' + id,
    method: 'get'
  })
}

// 新增机具调拨记录
export function addImplement(data) {
  return request({
    url: '/system/implement',
    method: 'post',
    data: data
  })
}

// 修改机具调拨记录
export function updateImplement(data) {
  return request({
    url: '/system/implement',
    method: 'put',
    data: data
  })
}

// 删除机具调拨记录
export function delImplement(id) {
  return request({
    url: '/system/implement/' + id,
    method: 'delete'
  })
}
