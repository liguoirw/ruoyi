import request from '@/utils/request'

// 查询交易通知子列表
export function listJytzzb(query) {
  return request({
    url: '/system/jytzzb/list',
    method: 'get',
    params: query
  })
}

// 查询交易通知子详细
export function getJytzzb(id) {
  return request({
    url: '/system/jytzzb/' + id,
    method: 'get'
  })
}

// 新增交易通知子
export function addJytzzb(data) {
  return request({
    url: '/system/jytzzb',
    method: 'post',
    data: data
  })
}

// 修改交易通知子
export function updateJytzzb(data) {
  return request({
    url: '/system/jytzzb',
    method: 'put',
    data: data
  })
}

// 删除交易通知子
export function delJytzzb(id) {
  return request({
    url: '/system/jytzzb/' + id,
    method: 'delete'
  })
}
