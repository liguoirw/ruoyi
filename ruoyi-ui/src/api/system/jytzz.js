import request from '@/utils/request'

// 查询交易通知主列表
export function listJytzz(query) {
  return request({
    url: '/system/jytzz/list',
    method: 'get',
    params: query
  })
}

// 查询交易通知主详细
export function getJytzz(id) {
  return request({
    url: '/system/jytzz/' + id,
    method: 'get'
  })
}

// 新增交易通知主
export function addJytzz(data) {
  return request({
    url: '/system/jytzz',
    method: 'post',
    data: data
  })
}

// 修改交易通知主
export function updateJytzz(data) {
  return request({
    url: '/system/jytzz',
    method: 'put',
    data: data
  })
}

// 删除交易通知主
export function delJytzz(id) {
  return request({
    url: '/system/jytzz/' + id,
    method: 'delete'
  })
}
