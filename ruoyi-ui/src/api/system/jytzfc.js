import request from '@/utils/request'

// 查询交易通知返参列表
export function listJytzfc(query) {
  return request({
    url: '/system/jytzfc/list',
    method: 'get',
    params: query
  })
}

// 查询交易通知返参详细
export function getJytzfc(id) {
  return request({
    url: '/system/jytzfc/' + id,
    method: 'get'
  })
}

// 新增交易通知返参
export function addJytzfc(data) {
  return request({
    url: '/system/jytzfc',
    method: 'post',
    data: data
  })
}

// 修改交易通知返参
export function updateJytzfc(data) {
  return request({
    url: '/system/jytzfc',
    method: 'put',
    data: data
  })
}

// 删除交易通知返参
export function delJytzfc(id) {
  return request({
    url: '/system/jytzfc/' + id,
    method: 'delete'
  })
}
